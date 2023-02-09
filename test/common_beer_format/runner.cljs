(ns common-beer-format.runner
  "The namespace that drives `doo` to select tests to run in a ClojureScript environment."
  (:require [common-beer-format.core-test]
            [common-beer-format.generative.equipment-test]
            [common-beer-format.generative.fermentables-test]
            [common-beer-format.generative.hops-test]
            [common-beer-format.generative.mash-test]
            [common-beer-format.generative.miscs-test]
            [common-beer-format.generative.primitives-test]
            [common-beer-format.generative.recipes-test]
            [common-beer-format.generative.styles-test]
            [common-beer-format.generative.waters-test]
            [common-beer-format.generative.yeasts-test]
            [common-beer-format.impl-test]
            [common-beer-format.primitives-test]
            [doo.runner :refer-macros [doo-tests]]))


(doo-tests 'common-beer-format.core-test
           'common-beer-format.generative.equipment-test
           'common-beer-format.generative.fermentables-test
           'common-beer-format.generative.hops-test
           'common-beer-format.generative.mash-test
           'common-beer-format.generative.miscs-test
           'common-beer-format.generative.primitives-test
           'common-beer-format.generative.recipes-test
           'common-beer-format.generative.styles-test
           'common-beer-format.generative.waters-test
           'common-beer-format.generative.yeasts-test
           'common-beer-format.impl-test
           'common-beer-format.primitives-test)
