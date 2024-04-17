package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import com.withings.device.Device;
import com.withings.library.measure.MeasuresGroup;
import java.io.Serializable;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ Serializable a(Bundle bundle) {
        return bundle.getSerializable("EXTRA_DEVICE", Device.class);
    }

    public static /* bridge */ /* synthetic */ Serializable b(Bundle bundle) {
        return bundle.getSerializable("extra_measures_group", MeasuresGroup.class);
    }
}
