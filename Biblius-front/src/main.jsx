import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'leaflet/dist/leaflet.css';
import './i18n';
import './index.css'
import App from './App.jsx'
import { BrowserRouter} from 'react-router-dom';
import { AuthContextProvider } from './store/AuthContext.jsx';


createRoot(document.getElementById('root')).render(
  <StrictMode>
    <BrowserRouter>
      <AuthContextProvider>
          <App />
      </AuthContextProvider>
  </BrowserRouter>
  </StrictMode>,
)

