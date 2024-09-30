package com.diegodsoliveira.airbnb_clone_back.listing.domain.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { ListingPictureMapper.class })
public interface ListingMapper {

}
