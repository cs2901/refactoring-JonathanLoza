void renderBanner() {
    final boolean isMac = (platform.toUpperCase().indexOf("MAC") > -1);
    final boolean isIe = (browser.toUpperCase().indexOf("IE") > -1);
    final boolean resize = resize > 0;
  if ( isMac && isIe&&
        wasInitialized() && resize)
  {
    // do something
  }
}