for $profesor in /profesor
where starts-with(data($profesor/dni),3)
return $profesor