void renderBanner() {
    final Boolean isMac = (platform.toUpperCase().indexOf("MAC") > -1);
    final Boolean isIe = (browser.toUpperCase().indexOf("IE") > -1);
    final Boolean resize = resize > 0;
  if ( isMac && isIe&&
        wasInitialized() && resize)
  {
    // do something
  }
}