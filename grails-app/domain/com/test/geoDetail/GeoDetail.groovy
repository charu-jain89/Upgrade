package com.test.geoDetail

import com.test.GeoType

class GeoDetail {

  Long id
  GeoType type

  BigDecimal locLat
  BigDecimal locLong

  static mapping = {

    table 'GEO_DETAIL'
    version false
    discriminator column: 'GEO_DETAIL_TYPE_ID'

    id column: 'GEO_DETAIL_ID'

    type column: 'GEO_DETAIL_TYPE_ID', insertable: false, updateable: false
    locLat column: 'LOC_LAT'
    locLong column: 'LOC_LONG'

  }

  static constraints = {
    locLat(nullable: true)
    locLong(nullable: true)
  }
}