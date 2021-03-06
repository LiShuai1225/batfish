package org.batfish.datamodel.collections;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.batfish.common.Pair;
import org.batfish.datamodel.Configuration;
import org.batfish.datamodel.OspfNeighbor;

public final class VerboseOspfEdge extends Pair<NodeOspfSessionPair, NodeOspfSessionPair> {

  private static final String EDGE_SUMMARY_VAR = "edgeSummary";

  private static final String NODE1_SESSION_VAR = "node1Session";

  private static final String NODE1_VAR = "node1";

  private static final String NODE2_SESSION_VAR = "node2Session";

  private static final String NODE2_VAR = "node2";

  private static final long serialVersionUID = 1L;

  private final IpEdge _edgeSummary;

  @JsonCreator
  public VerboseOspfEdge(
      @JsonProperty(NODE1_VAR) Configuration node1,
      @JsonProperty(NODE1_SESSION_VAR) OspfNeighbor s1,
      @JsonProperty(NODE2_VAR) Configuration node2,
      @JsonProperty(NODE2_SESSION_VAR) OspfNeighbor s2,
      @JsonProperty(EDGE_SUMMARY_VAR) IpEdge e) {
    super(new NodeOspfSessionPair(node1, s1), new NodeOspfSessionPair(node2, s2));
    this._edgeSummary = e;
  }

  @JsonProperty(EDGE_SUMMARY_VAR)
  public IpEdge getEdgeSummary() {
    return _edgeSummary;
  }

  @JsonProperty(NODE1_VAR)
  public Configuration getNode1() {
    return _first.getHost();
  }

  @JsonProperty(NODE2_VAR)
  public Configuration getNode2() {
    return _second.getHost();
  }

  @JsonProperty(NODE1_SESSION_VAR)
  public OspfNeighbor getSession1() {
    return _first.getSession();
  }

  @JsonProperty(NODE2_SESSION_VAR)
  public OspfNeighbor getSession2() {
    return _second.getSession();
  }
}
