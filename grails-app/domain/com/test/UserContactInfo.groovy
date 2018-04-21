package com.test

import com.test.geoDetail.IpDetail

class UserContactInfo {

  String fullname
  String company

  static hasMany = [
      ipGeoDetails: IpDetail,
  ]

  static mapping = {
    table 'CONTACT_INFO'
    version false

    id column: 'CONTACT_INFO_ID'
    fullname column: 'FULLNAME'
    company column: 'COMPANY'

    sort "id"
  }

  static constraints = {
    fullname(nullable: true)
    company(nullable: true)
  }
}