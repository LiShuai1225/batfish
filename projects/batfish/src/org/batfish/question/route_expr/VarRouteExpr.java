package org.batfish.question.route_expr;

import org.batfish.question.Environment;
import org.batfish.representation.PrecomputedRoute;

public final class VarRouteExpr extends BaseRouteExpr {

   private final String _var;

   public VarRouteExpr(String var) {
      _var = var;
   }

   @Override
   public PrecomputedRoute evaluate(Environment environment) {
      return environment.getRoutes().get(_var);
   }

}