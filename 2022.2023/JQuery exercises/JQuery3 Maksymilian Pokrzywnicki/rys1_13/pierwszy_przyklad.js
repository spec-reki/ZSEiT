$('div').each(function(nr) {
  console.log('numer diva o nazwie', this.id, 'to', nr);
});

$(function() {
  $('div').each(function() {
    $('a').each(function() {
      alert($(this).text());
    })
  })
})