package org.batfish.datamodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class GeneratedRoute6 extends AbstractRoute6 implements Comparable<GeneratedRoute6> {

  public static class Builder extends AbstractRoute6Builder<GeneratedRoute6> {

    private AsPath _asPath;

    private String _attributePolicy;

    private boolean _discard;

    private String _generationPolicy;

    private String _nextHopInterface;

    public Builder() {
      _nextHopIp = Route6.UNSET_ROUTE_NEXT_HOP_IP;
    }

    @Override
    public GeneratedRoute6 build() {
      GeneratedRoute6 gr = new GeneratedRoute6(_network, _nextHopIp);
      gr.setAdministrativePreference(_admin);
      gr.setMetric(_metric);
      gr.setGenerationPolicy(_generationPolicy);
      gr.setAttributePolicy(_attributePolicy);
      gr.setDiscard(_discard);
      gr.setAsPath(_asPath);
      gr.setNextHopInterface(_nextHopInterface);
      return gr;
    }

    public void setAsPath(AsPath asPath) {
      _asPath = asPath;
    }

    public void setAttributePolicy(String attributePolicy) {
      _attributePolicy = attributePolicy;
    }

    public void setDiscard(boolean discard) {
      _discard = discard;
    }

    public void setGenerationPolicy(String generationPolicy) {
      _generationPolicy = generationPolicy;
    }

    public void setNextHopInterface(String nextHopInterface) {
      _nextHopInterface = nextHopInterface;
    }
  }

  private static final String AS_PATH_VAR = "asPath";

  private static final String DISCARD_VAR = "discard";

  private static final String METRIC_VAR = "metric";

  private static final long serialVersionUID = 1L;

  private int _administrativeCost;

  private AsPath _asPath;

  private String _attributePolicy;

  private boolean _discard;

  private String _generationPolicy;

  private Integer _metric;

  private String _nextHopInterface;

  @JsonCreator
  public GeneratedRoute6(@JsonProperty(NETWORK_VAR) Prefix6 prefix6) {
    super(prefix6, Route6.UNSET_ROUTE_NEXT_HOP_IP);
  }

  public GeneratedRoute6(Prefix6 prefix6, int administrativeCost) {
    super(prefix6, Route6.UNSET_ROUTE_NEXT_HOP_IP);
    _administrativeCost = administrativeCost;
  }

  public GeneratedRoute6(Prefix6 prefix6, Ip6 nextHopIp) {
    super(prefix6, nextHopIp);
  }

  @Override
  public int compareTo(GeneratedRoute6 o) {
    return _network.compareTo(o._network);
  }

  @Override
  public boolean equals(Object o) {
    GeneratedRoute6 rhs = (GeneratedRoute6) o;
    return _network.equals(rhs._network);
  }

  @Override
  public int getAdministrativeCost() {
    return _administrativeCost;
  }

  @JsonProperty(AS_PATH_VAR)
  public AsPath getAsPath() {
    return _asPath;
  }

  public String getAttributePolicy() {
    return _attributePolicy;
  }

  @JsonProperty(DISCARD_VAR)
  public boolean getDiscard() {
    return _discard;
  }

  public String getGenerationPolicy() {
    return _generationPolicy;
  }

  @JsonProperty(METRIC_VAR)
  @Override
  public Integer getMetric() {
    return _metric;
  }

  @Override
  public String getNextHopInterface() {
    return _nextHopInterface;
  }

  @Override
  @JsonIgnore
  public Ip6 getNextHopIp() {
    return super.getNextHopIp();
  }

  @Override
  public RoutingProtocol getProtocol() {
    return RoutingProtocol.AGGREGATE;
  }

  @Override
  @JsonIgnore
  public int getTag() {
    return NO_TAG;
  }

  @Override
  public int hashCode() {
    return _network.hashCode();
  }

  @JsonProperty(ADMINISTRATIVE_COST_VAR)
  public void setAdministrativePreference(int preference) {
    _administrativeCost = preference;
  }

  @JsonProperty(AS_PATH_VAR)
  public void setAsPath(AsPath asPath) {
    _asPath = asPath;
  }

  public void setAttributePolicy(String attributePolicy) {
    _attributePolicy = attributePolicy;
  }

  @JsonProperty(DISCARD_VAR)
  public void setDiscard(boolean discard) {
    _discard = discard;
  }

  public void setGenerationPolicy(String generationPolicy) {
    _generationPolicy = generationPolicy;
  }

  @JsonProperty(METRIC_VAR)
  public void setMetric(int metric) {
    _metric = metric;
  }

  public void setNextHopInterface(String nextHopInterface) {
    _nextHopInterface = nextHopInterface;
  }
}
