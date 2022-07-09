(ns common-beer-format.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [common-beer-format.core-test]
            [common-beer-format.data-test]
            [common-beer-format.primitives-test]))


(doo-tests 'common-beer-format.core-test
           'common-beer-format.data-test
           'common-beer-format.primitives-test)
