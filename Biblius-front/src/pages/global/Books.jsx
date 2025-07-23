import  { useEffect, useState } from 'react'
import { Link } from 'react-router-dom';
import styles from "../../css/BooksPage.module.css"


function Books() {
  const apiUrl = import.meta.env.VITE_API_URL;
  const [books, setBooks] = useState([]);


   useEffect(() => {
        fetch(`${apiUrl}/books`)
        .then(res => res.json())
        .then(json => setBooks(json))
      }, [apiUrl]);



  return (
    <div>
      
      <div>
        <div className={styles.bookbox}>
          {books.sort((a,b) => a.id - b.id).map((book) => 
          <div key={book.id}>
            <img  src={book.image} className={styles.image} alt="" />
            <div>{book.title}</div>
            <div>{book.author}</div>
            {/* <Link to={"/book/" + book.id} > 
              <button> Check out</button> 
            </Link>  */}
            <div>
              <button disabled={!book.active} >
                Bron
              </button>
            </div>
          </div>
        )}
        </div>
      </div>

    </div>
  )
}

export default Books