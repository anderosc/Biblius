
import { Route, Routes } from 'react-router-dom'
import './App.css'
import NavigationBar from './components/NavigationBar'
import HomePage from './pages/global/HomePage'
import ContactUs from './pages/global/ContactUs'
// import Shops from './pages/global/Shops'
import SingleBook from './pages/global/SingleBook'
import AdminHome from './pages/admin/AdminHome'
import MaintainCategories from './pages/admin/MaintainCategories'
import MaintainShops from './pages/admin/MaintainShops'
import Login from './pages/auth/Login'
import Signup from './pages/auth/Signup'
import NotFound from './pages/global/NotFound'
import { useContext } from 'react'
import { AuthContext } from './store/AuthContext'
import Books from './pages/global/Books'
import EditBooks from './pages/admin/EditBooks'
import AddBook from './pages/admin/AddBook'
import MaintainBooks from './pages/admin/MaintainBooks'

function App() {

  const {loggedIn} = useContext(AuthContext)


  return (
    <>
     <div className='App'>
      <NavigationBar /> 

      <Routes>
        <Route path="" element={ <HomePage/>} />
        <Route path="/contact" element={ <ContactUs/>} />
        <Route path="/books" element={ <Books/>} />
        <Route path="/product/:id" element={ <SingleBook/>} />

      {  loggedIn === true ? <>
        <Route path="/admin" element={ <AdminHome/>} />
        <Route path="/admin/add-book" element={ <AddBook/>} />
        <Route path="/admin/edit-product/:id" element={ <EditBooks />} />
        <Route path="/admin/maintain-books" element={ <MaintainBooks/>} />
        <Route path="/admin/maintain-categories" element={ <MaintainCategories/>} />
        <Route path="/admin/maintain-shops" element={ <MaintainShops/>} />
        </> :
        <Route path="/admin/*" element={ <Login/>} />
        }


        <Route path="/login" element={ <Login/>} />
        <Route path="/signup" element={ <Signup/>} />

        <Route path="/*" element={ <NotFound/>} />


      </Routes>
     </div>
    </>
  )
}

export default App
