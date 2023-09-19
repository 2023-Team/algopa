const sidebar = document.querySelector('.sidebar')
const spans = sidebar.querySelectorAll('div > span')

console.log(spans)
spans.forEach((span) => {
  span.classList.add('hidden')
  // span.style.color = 'pink'
})
function 확장() {
  console.log('확장')
  // setTimeout(() => {}, 2)
  // spans.forEach((span) => {
  //   span.classList.toggle('hidden')
  //   // span.style.color = 'pink'
  // })
  setTimeout(() => {
    spans.forEach((span) => {
      span.classList.toggle('hidden')
      // span.style.color = 'pink'
    })
  }, 200)
}
function 축소() {
  console.log('축소')
  spans.forEach((span) => {
    span.classList.add('hidden')
    span.style.color = 'black'
  })
}

function hello() {
  alert('안녕하세요')
}
sidebar.addEventListener('mouseleave', 축소)
sidebar.addEventListener('mouseenter', 확장)
