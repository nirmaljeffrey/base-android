package io.github.geeksforgeinc.base_android.data.domain.mapper

interface DomainMapper<ENTITY, DOMAIN, DTO> {
    fun mapFromEntity(entity: ENTITY): DOMAIN
    fun mapToEntity(domainModel: DOMAIN): ENTITY
    fun mapFromDto(dto: DTO): DOMAIN
    fun mapToDto(domainModel: DOMAIN): DTO
}