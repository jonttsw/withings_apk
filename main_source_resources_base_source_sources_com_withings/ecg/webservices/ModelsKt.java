package com.withings.ecg.webservices;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.Signal;
import com.withings.ecg.model.SignalMeta;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"hasMore", "", "Lcom/withings/ecg/webservices/GetSignalsResponse;", "toHeartSignalMeasurement", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "Lcom/withings/ecg/webservices/SignalResponse;", "ecg_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModelsKt {
    public static final boolean hasMore(GetSignalsResponse getSignalsResponse) {
        u.j(getSignalsResponse, "<this>");
        return getSignalsResponse.getMore();
    }

    public static final HeartSignalMeasurement toHeartSignalMeasurement(SignalResponse signalResponse) {
        u.j(signalResponse, "<this>");
        int metagain = signalResponse.getMetagain();
        long metaqfix = signalResponse.getMetaqfix();
        int metaoffset = signalResponse.getMetaoffset();
        SignalMeta signalMeta = new SignalMeta(0, signalResponse.getMetaduration(), signalResponse.getMetatotalsize(), metaoffset, metagain, metaqfix, signalResponse.getType(), signalResponse.getMetafreq(), (short) signalResponse.getMetachannel(), (short) signalResponse.getMetaformat(), (short) signalResponse.getMetasize(), (short) signalResponse.getMetaresolution(), 0L, 4097, null);
        long userid = signalResponse.getUserid();
        DateTime dateTime = new DateTime(signalResponse.getTimestamp() * 1000);
        Signal signal = new Signal(Long.valueOf(signalResponse.getSignalid()), signalMeta, null, 4, null);
        int model = signalResponse.getModel();
        ArrayList arrayList = new ArrayList();
        long millis = signalResponse.getModified().getMillis();
        Integer metaWearPosition = signalResponse.getMetaWearPosition();
        Integer firmwareVersion = signalResponse.getFirmwareVersion();
        return new HeartSignalMeasurement(0L, userid, model, dateTime, signal, true, millis, Long.valueOf(signalResponse.getDeviceid()), metaWearPosition, signalResponse.getDeleted(), arrayList, firmwareVersion, signalResponse.getBrand(), 1, null);
    }
}
