const createNav = () => {
    let nav = document.querySelector('.navbar');

    nav.innerHTML = `
      <div class="nav">
         <img src="/static/img/nav/reading-book.png" class="brand-logo" alt="">
        <div class="nav-items">
            <div class="search">
                <input type="text" class="search-box" placeholder="search the book, category">
                <button class="search-btn">search</button>
            </div>
                <a href="user.html"><img src="/static/img/nav/book-reader.png" alt=""></a>
                <a href="bucket-2.html"><img src="/static/img/nav/cart.png" alt=""></a>
        </div>        
      </div>
      
        <ul class="links-container">     
           
            <li class="link-item"><a href="index.html" class="link">Home</a></li>
            <li class="link-item"><a href="product.html" class="link">Books</a></li>
            <li class="link-item"><a href="#" class="link">Fuck</a></li>
            <li class="link-item"><a href="#" class="link">You</a></li>
            <li class="link-item"><a href="#" class="link">Services</a></li>
            <li class="link-item"><a href="#" class="link">Gifts</a></li>
            <li class="link-item"><a href="contacts.html" class="link">Contact</a></li>        
         </ul>`;

}
createNav();

