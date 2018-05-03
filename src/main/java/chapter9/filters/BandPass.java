package chapter9.filters;

public class BandPass extends Filter {

  double lowCufoff, highCutoff;

  public BandPass(double lowCut, double highCut) {
    this.lowCufoff = lowCut;
    this.highCutoff = highCut;
  }

  public Waveform process(Waveform input) {
    return input;
  }

}
