const Home = () => {

  const handleClick  = () => {
    if(document.getElementById("menu").style.marginLeft == "0%")
    document.getElementById("menu").style.marginLeft = "-100%";
    else
    document.getElementById("menu").style.marginLeft = "0%";
  }

    return (
      <><div className="home">
        <h2>To-Do List</h2>
      </div>
      <div className="menubutton"><button class="menu_btn" onClick={handleClick}>CRUD</button></div>
      <div>
          <div className="content">
            <div class="menu" id="menu">
              <p class="item">First Item</p>
              <p class="item">Second Item</p>
              <p class="item">Third Item</p>
              <p class="item" >Fourth Item</p>
            </div>
          </div>
        </div></>
    );
  }
   
  export default Home;