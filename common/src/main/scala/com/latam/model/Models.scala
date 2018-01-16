package com.latam.model

final case class User(id: String, profile: Profile)

final case class Profile(email: String)
