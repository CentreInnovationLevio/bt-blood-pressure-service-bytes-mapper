package com.levio.lab.bt.bloodpressure.mappers;

import com.levio.lab.bt.bloodpressure.services.feature.BloodPressureFeatureDto;
import com.levio.lab.bt.bloodpressure.services.measurement.BloodPressureMeasurementDto;

public class BloodPressureBytesMapper {

  public BloodPressureBytesMapper() {

  }

  public BloodPressureFeatureDto mapBloodPressureFeature(byte[] bytes) {
    return BloodPressureFeatureBytesMapper.mapArrayOfBytesToReadableData(bytes);
  }

  public BloodPressureMeasurementDto mapBloodPressureMeasurement(byte[] bytes) {
    return BloodPressureMeasurementBytesMapper.mapArrayOfBytesToReadableData(bytes);
  }

}
