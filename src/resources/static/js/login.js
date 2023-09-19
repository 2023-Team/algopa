const login = document.querySelector('#login')

function onHandleLogin() {
  console.log('로그인 페이지로 이동')
}

console.log(login.value)
login.addEventListener('click', onHandleLogin)
