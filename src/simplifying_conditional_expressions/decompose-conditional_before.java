boolean noSummer(){
    return date.before(SUMMER_START) || date.after(SUMMER_END);
}

if (noSummer()) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}