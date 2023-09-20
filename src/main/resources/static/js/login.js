const login = document.querySelector('#login-button')
const admin_user = document.getElementById('admin-user')
const input_id = document.querySelector('#id-input-box input')
const General_user = document.getElementById('general-user')
const save_id = document.getElementById('save-id-button')
const login_form = document.querySelector('#login-form')
const before_check_save_id = window.localStorage.getItem('save_id')

if (before_check_save_id == 'true') {
  input_id.value = window.localStorage.getItem('id')
  save_id.checked = true
}
function onHandleLogin() {
  console.log('로그인 페이지로 이동')
}

function onHandleAdmin() {
  admin_user.classList.add('selected-user-type')
  General_user.classList.remove('selected-user-type')
}
function onHandleGeneral() {
  admin_user.classList.remove('selected-user-type')
  General_user.classList.add('selected-user-type')
}

function error() {
  console.log('복사하지마!')
}

function onHandleSaveId() {
  if (save_id.checked) {
    console.log('저장')
    window.localStorage.setItem('save_id', true)
  } else {
    console.log('해제')
    window.localStorage.setItem('save_id', false)
  }
}

function onLoginSubmit() {
  if (save_id.checked) {
    // console.log('저장')
    window.localStorage.setItem('id', input_id.value)
  }
}
console.log(login.value)
admin_user.addEventListener('click', onHandleAdmin)
General_user.addEventListener('click', onHandleGeneral)
login.addEventListener('click', onHandleLogin)
save_id.addEventListener('change', onHandleSaveId)
