<template>
  <div class="github-homepage">
    <nav class="navbar">
      <div class="logo">Logo</div>
      <div class="buttons">
        <button class="primary-button">Button 1</button>
        <button class="secondary-button">Button 2</button>
        <button class="secondary-button">Button 3</button>
        <button class="secondary-button">Button 4</button>
      </div>
      <div class="search-bar">
        <input type="text" placeholder="Search" class="modern-input">
        <button class="primary-button">Search</button>
      </div>
    </nav>
    <div class="content">
      <h1 class="artistic-text">Let's Build from here</h1>
      <div class="about-us">
        <h2>About Us</h2>
        <p>Welcome to our GitHub homepage.</p>
        <p>We are a team of passionate developers.</p>
        <p>Feel free to explore our projects and contributions.</p>
      </div>
    </div>
  </div>
</template>

<style scoped>
.github-homepage {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding-top: 50px;
}

.navbar {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 50px;
  background-color: #f0f0f0;
  padding: 0 20px;
}

.logo {
  font-weight: bold;
}

.buttons {
  display: flex;
}

.buttons button {
  margin-left: 10px;
}

.primary-button {
  background-color: #2196F3;
  color: white;
  border: none;
  padding: 10px 20px;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s;
}

.secondary-button {
  background-color: white;
  color: #2196F3;
  border: 1px solid #2196F3;
  padding: 10px 20px;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s;
}

.secondary-button:hover {
  background-color: #2196F3;
  color: white;
}

.search-bar {
  display: flex;
  align-items: center;
}

.modern-input {
  padding: 10px;
  border: none;
  border-radius: 4px;
  background-color: #f0f0f0;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  font-size: 14px;
  transition: box-shadow 0.3s;
}

.modern-input:focus {
  outline: none;
  box-shadow: 0 0 8px rgba(33, 150, 243, 0.5);
}

.content {
  text-align: center;
  margin-top: 50px;
}

h1 {
  font-size: 2rem;
}

.artistic-text {
  font-family: 'Your Artistic Font', cursive;
  font-size: 3rem;
  color: white;
  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
  background-size: cover;
  display: inline-block;
  padding: 10px 20px;
}

.info {
  background-color: #f0f0f0;
  padding: 20px;
  margin-top: 20px;
}

.about-us {
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  background-color: #f0f0f0;
  padding: 20px;
  box-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
  text-align: left;
}

.about-us h2 {
  font-size: 1.5rem;
  margin-bottom: 10px;
  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
  text-align: left;
  color: #2196F3;
}

.about-us p {
  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
  text-align: left;
  color: #2196F3;
}

h2 {
  font-size: 1.5rem;
  margin-bottom: 10px;
}
</style>