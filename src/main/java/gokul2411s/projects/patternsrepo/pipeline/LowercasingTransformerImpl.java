package gokul2411s.projects.patternsrepo.pipeline;

import gokul2411s.projects.patternsrepo.transformation.Transformer;

/**
 * A {@link Transformer} that converts strings to lower-case.
 */
class LowercasingTransformerImpl implements Transformer<WorkUnit> {

  @Override
  public WorkUnit apply(WorkUnit input) {
    return new WorkUnit(input.getText().toLowerCase());
  }
}
