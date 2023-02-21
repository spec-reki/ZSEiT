const Home = () => {

  const handleClick  = () => {
    if(document.getElementById("menu").style.marginLeft == "0%")
    document.getElementById("menu").style.marginLeft = "-100%";
    else
    document.getElementById("menu").style.marginLeft = "0%";
  }

    return (
      <><div className="home">
      <h2 className="TDL">To-Do List</h2>
      </div>
      <div className="menubutton"><button class="menu_btn" onClick={handleClick}>CRUD</button></div>
      <div>
          <div className="content">
            <div class="menu" id="menu">
              <p class="item">Create Item</p>
              <p class="item">List of your items</p>
              <p class="item">Edit one of your items</p>
              <p class="item">Delete one o your items</p>
            </div>
          </div>
        </div></>
    );
  }
   
  export default Home;