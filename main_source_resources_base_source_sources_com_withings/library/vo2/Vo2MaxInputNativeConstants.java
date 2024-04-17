package com.withings.library.vo2;

import fi.firstbeat.ete.EteInput;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: Vo2MaxInput.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/withings/library/vo2/Vo2MaxInputNativeConstants;", "", "()V", "Companion", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vo2MaxInputNativeConstants {
    public static final Companion Companion = new Companion(null);

    /* compiled from: Vo2MaxInput.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/vo2/Vo2MaxInputNativeConstants$Companion;", "", "()V", "ETE_ALTITUDE_SOURCE_DEFAULT", "Lcom/withings/library/vo2/AltitudeSource;", "getETE_ALTITUDE_SOURCE_DEFAULT", "()Lcom/withings/library/vo2/AltitudeSource;", "ETE_UNKNOWN_STEP_RATE", "", "getETE_UNKNOWN_STEP_RATE", "()I", "Vo2Lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final AltitudeSource getETE_ALTITUDE_SOURCE_DEFAULT() {
            return Vo2MaxInputKt.toLocalAltitudeSource(EteInput.AltitudeSource.DEFAULT);
        }

        public final int getETE_UNKNOWN_STEP_RATE() {
            return 0;
        }

        private Companion() {
        }
    }
}
