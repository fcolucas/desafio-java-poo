package com.classes;

public class IPhone {
  private ITunes iTunes;
  private Safari safari;
  private ICall iCall;

  public IPhone(ITunes iTunes, Safari safari, ICall iCall) {
    this.iTunes = iTunes;
    this.safari = safari;
    this.iCall = iCall;
  }

  public ITunes getITunes() {
    return iTunes;
  }

  public void setITunes(ITunes iTunes) {
    this.iTunes = iTunes;
  }

  public Safari getSafari() {
    return safari;
  }

  public void setSafari(Safari safari) {
    this.safari = safari;
  }

  public ICall getICall() {
    return iCall;
  }

  public void setICall(ICall iCall) {
    this.iCall = iCall;
  }
}
