import React from 'react';
import ToDo from './components/Todo'
import ToDoList from './components/TodoList'
import './App.css';

const App = props => {
  return (
    <div> 
      <ToDoList />
      <ToDo />
      </div>
  )
}

export default App
