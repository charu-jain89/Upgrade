package com.test

class GeoType {
  Long id
  String name

  static mapping = {
    table 'GEO_DETAIL_TYPE'

    version false
    id column: 'GEO_DETAIL_TYPE_ID'
    name column: 'NAME'
  }

  static constraints = {
    name(nullable: true)
  }
}