import { useState } from "react";
import { useRef } from "react";
import Button from 'react-bootstrap/Button';
import Modal from 'react-bootstrap/Modal';

function MaintainCategories() {
  const [categories, setCategories] = useState([]);
  const categoryRef = useRef();
  const [idToBeDeleted, setIdToBeDeleted] = useState(-1);

  const [show, setShow] = useState(false);

  const handleClose = () => setShow(false);
  const handleShow = (index) => {
    setShow(true)
    setIdToBeDeleted(index)
  };

  const removeCategory = () =>{
    if(idToBeDeleted !== -1){
      categories.splice(idToBeDeleted, 1);
    setCategories(categories.slice());
  }
    handleClose();
  }
  const addCategory = () =>{
    categories.push(categoryRef.current.value);
    setCategories(categories.slice());
  }

  return (
    <div>
      <label htmlFor="">Category</label> <br />
      <input ref={categoryRef} />
      <button onClick={() => addCategory()}>ADD</button>
      {categories.map((category, index) => 
      
        <div key={category}> {category}
        <button onClick={() => handleShow(index)}>X</button> </div>
      )}

      <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Deleting category</Modal.Title>
        </Modal.Header>
        <Modal.Body>You are about to delete category. This is irreversible!</Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Close
          </Button>
          <Button variant="primary" onClick={ removeCategory}>
            Yes, I want to delete
          </Button>
        </Modal.Footer>
      </Modal>
    </div>
  )
}

export default MaintainCategories