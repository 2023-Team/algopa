const sidebar = document.querySelector('#side-bar')
const spans = sidebar.querySelectorAll('span')

console.log(spans)
function 확장() {
  console.log('확장')
  spans.forEach((span) => {
    span.classList.toggle('hidden')
    // span.style.color = 'pink'
  })
}
function 축소() {
  console.log('축소')
  spans.forEach((span) => {
    span.classList.add('hidden')
    span.style.color = 'black'
  })
}

function hello()  {
  alert('안녕하세요');
}
sidebar.addEventListener('mouseleave', 축소)
sidebar.addEventListener('mouseenter', 확장)
