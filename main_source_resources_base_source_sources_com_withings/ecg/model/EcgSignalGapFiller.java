package com.withings.ecg.model;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EcgSignalGapFiller.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/withings/ecg/model/EcgSignalGapFiller;", "", "()V", "fillGap", "", "ecgData", "Lcom/withings/ecg/model/LiveEcgData;", "currentPayloadIndex", "", "samples", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EcgSignalGapFiller {
    public static final int $stable = 0;
    public static final EcgSignalGapFiller INSTANCE = new EcgSignalGapFiller();

    private EcgSignalGapFiller() {
    }

    public final byte[] fillGap(LiveEcgData liveEcgData, int i11, byte[] samples) {
        u.j(samples, "samples");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (liveEcgData != null) {
            int index = liveEcgData.getIndex();
            while (true) {
                index++;
                if (index == 0 || index > i11) {
                    break;
                }
                byteArrayOutputStream.write(samples);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        u.i(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
