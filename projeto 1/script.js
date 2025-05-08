document.addEventListener('DOMContentLoaded', () => {
  let prevButton = document.getElementById('prev');
  let nextButton = document.getElementById('next');
  let container = document.querySelector('.container');
  let items = container.querySelectorAll('.list .item');
  let indicator = document.querySelector('.indicators');
  let dots = indicator.querySelectorAll('ul li');

  let active = 0;
  let firstPosition = 0;
  let lastPosition = items.length - 1;

  if (prevButton && nextButton && container && items.length > 0 && dots.length > 0) {
    nextButton.onclick = () => {
      let itemOld = container.querySelector('.list .item.active');
      if (itemOld) itemOld.classList.remove('active');

      active = active + 1 > lastPosition ? 0 : active + 1;
      items[active].classList.add('active');

      updateIndicators();
    };

    prevButton.onclick = () => {
      let itemOld = container.querySelector('.list .item.active');
      if (itemOld) itemOld.classList.remove('active');

      active = active - 1 < firstPosition ? lastPosition : active - 1;
      items[active].classList.add('active');

      updateIndicators();
    };

    function updateIndicators() {
      indicator.querySelector('ul li.active')?.classList.remove('active');
      dots[active].classList.add('active');
    }
  } else {
    console.error('Um ou mais elementos necessários não foram encontrados no DOM.');
  }
});