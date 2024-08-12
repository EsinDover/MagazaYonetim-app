
document.getElementById('search-icon').addEventListener('click', function() {
    var searchForm = document.getElementById('search-form');
    if (searchForm.classList.contains('show')) {
        searchForm.classList.remove('show');
    } else {
        searchForm.classList.add('show');
        searchForm.querySelector('input').focus(); // Form açıldığında input'a odaklan
    }
});
