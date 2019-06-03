double disabilityAmount() {
  if (noDisability) {
    return 0;
  }
  // Compute the disability amount.
  // ...
}

boolean noDisability(){
    return (seniority < 2 || monthsDisabled > 12 || isPartTime);
}