package com.withings.comm.trace;

import androidx.compose.material.h6;
import com.google.gson.JsonObject;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.withings.library.authentication.api.ConstantsWs;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
/* loaded from: classes3.dex */
public final class Traces {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class AppStatus {

        /* renamed from: a  reason: collision with root package name */
        public static final AppStatus f33166a;

        /* renamed from: b  reason: collision with root package name */
        public static final AppStatus f33167b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ AppStatus[] f33168c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.comm.trace.Traces$AppStatus] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.comm.trace.Traces$AppStatus] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.comm.trace.Traces$AppStatus] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.comm.trace.Traces$AppStatus] */
        static {
            ?? r02 = new Enum("Foreground", 0);
            f33166a = r02;
            ?? r12 = new Enum("Background", 1);
            f33167b = r12;
            f33168c = new AppStatus[]{r02, r12, new Enum("Inactive", 2), new Enum(DeviceInfo.STR_TYPE_UNKNOWN, 3)};
        }

        private AppStatus() {
            throw null;
        }

        public static AppStatus valueOf(String str) {
            return (AppStatus) Enum.valueOf(AppStatus.class, str);
        }

        public static AppStatus[] values() {
            return (AppStatus[]) f33168c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class ConnectReason {

        /* renamed from: a  reason: collision with root package name */
        public static final ConnectReason f33169a;

        /* renamed from: b  reason: collision with root package name */
        public static final ConnectReason f33170b;

        /* renamed from: c  reason: collision with root package name */
        public static final ConnectReason f33171c;

        /* renamed from: d  reason: collision with root package name */
        public static final ConnectReason f33172d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ ConnectReason[] f33173e;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectReason] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectReason] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectReason] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectReason] */
        static {
            ?? r02 = new Enum("UserRequest", 0);
            f33169a = r02;
            ?? r12 = new Enum("DeviceRequest", 1);
            f33170b = r12;
            ?? r22 = new Enum("FirmwareUpdate", 2);
            f33171c = r22;
            ?? r32 = new Enum("Other", 3);
            f33172d = r32;
            f33173e = new ConnectReason[]{r02, r12, r22, r32};
        }

        private ConnectReason() {
            throw null;
        }

        public static ConnectReason valueOf(String str) {
            return (ConnectReason) Enum.valueOf(ConnectReason.class, str);
        }

        public static ConnectReason[] values() {
            return (ConnectReason[]) f33173e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class ConnectionSupport {

        /* renamed from: a  reason: collision with root package name */
        public static final ConnectionSupport f33174a;

        /* renamed from: b  reason: collision with root package name */
        public static final ConnectionSupport f33175b;

        /* renamed from: c  reason: collision with root package name */
        public static final ConnectionSupport f33176c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ ConnectionSupport[] f33177d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectionSupport] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectionSupport] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectionSupport] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectionSupport] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.comm.trace.Traces$ConnectionSupport] */
        static {
            ?? r02 = new Enum("Bluetooth", 0);
            f33174a = r02;
            ?? r12 = new Enum("BLE", 1);
            f33175b = r12;
            ?? r22 = new Enum("Wifi", 2);
            ?? r32 = new Enum("USB", 3);
            ?? r42 = new Enum("XMPP", 4);
            f33176c = r42;
            f33177d = new ConnectionSupport[]{r02, r12, r22, r32, r42};
        }

        private ConnectionSupport() {
            throw null;
        }

        public static ConnectionSupport valueOf(String str) {
            return (ConnectionSupport) Enum.valueOf(ConnectionSupport.class, str);
        }

        public static ConnectionSupport[] values() {
            return (ConnectionSupport[]) f33177d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class DisconnectStatus {

        /* renamed from: a  reason: collision with root package name */
        public static final DisconnectStatus f33178a;

        /* renamed from: b  reason: collision with root package name */
        public static final DisconnectStatus f33179b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ DisconnectStatus[] f33180c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.comm.trace.Traces$DisconnectStatus] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.comm.trace.Traces$DisconnectStatus] */
        static {
            ?? r02 = new Enum("OK", 0);
            f33178a = r02;
            ?? r12 = new Enum("NG", 1);
            f33179b = r12;
            f33180c = new DisconnectStatus[]{r02, r12};
        }

        private DisconnectStatus() {
            throw null;
        }

        public static DisconnectStatus valueOf(String str) {
            return (DisconnectStatus) Enum.valueOf(DisconnectStatus.class, str);
        }

        public static DisconnectStatus[] values() {
            return (DisconnectStatus[]) f33180c.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static class Vo2max {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes3.dex */
        public static final class Platform {

            /* renamed from: a  reason: collision with root package name */
            private static final /* synthetic */ Platform[] f33184a = {new Enum("Android", 0), new Enum("iOS", 1)};
            /* JADX INFO: Fake field, exist only in values array */
            Platform EF5;

            private Platform() {
                throw null;
            }

            public static Platform valueOf(String str) {
                return (Platform) Enum.valueOf(Platform.class, str);
            }

            public static Platform[] values() {
                return (Platform[]) f33184a.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes3.dex */
        public static final class WorkoutSource {

            /* renamed from: a  reason: collision with root package name */
            public static final WorkoutSource f33185a;

            /* renamed from: b  reason: collision with root package name */
            public static final WorkoutSource f33186b;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ WorkoutSource[] f33187c;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.comm.trace.Traces$Vo2max$WorkoutSource, java.lang.Enum] */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.comm.trace.Traces$Vo2max$WorkoutSource, java.lang.Enum] */
            static {
                ?? r02 = new Enum("Device", 0);
                f33185a = r02;
                ?? r12 = new Enum("App", 1);
                f33186b = r12;
                f33187c = new WorkoutSource[]{r02, r12};
            }

            private WorkoutSource() {
                throw null;
            }

            public static WorkoutSource valueOf(String str) {
                return (WorkoutSource) Enum.valueOf(WorkoutSource.class, str);
            }

            public static WorkoutSource[] values() {
                return (WorkoutSource[]) f33187c.clone();
            }
        }

        public static JsonObject a(boolean z5, DateTime dateTime) {
            JsonObject a11 = Traces.a("gpsStatus");
            a11.addProperty("plateform", "Android");
            a11.addProperty("isGpsWorking", Boolean.valueOf(z5));
            a11.addProperty("timestamp", Traces.b(dateTime));
            return a11;
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static JsonObject a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z5) {
            JsonObject a11 = Traces.a("alarm");
            h6.c(i11, a11, "hour", i12, "minute");
            h6.c(i13, a11, "wday", i14, "mday");
            h6.c(i15, a11, "month", i16, "year");
            a11.addProperty(XHTMLText.SPAN, Integer.valueOf(i17));
            a11.addProperty("appToDevice", Boolean.valueOf(z5));
            return a11;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {
        public static JsonObject a(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24) {
            JsonObject a11 = Traces.a("vasistas_sync_end");
            a11.addProperty("category", str);
            a11.addProperty("vasistas_count", Integer.valueOf(i11));
            h6.c(i12, a11, "empty_vasistas_count", i13, "empty_vasistas_duration");
            h6.c(i14, a11, "day_vasistas_count", i15, "day_vasistas_duration");
            h6.c(i16, a11, "sleep_vasistas_count", i17, "sleep_vasistas_duration");
            h6.c(i18, a11, "swim_vasistas_count", i19, "swim_vasistas_duration");
            h6.c(i21, a11, "spo2_vasistas_count", i22, "spo2_vasistas_duration");
            h6.c(i23, a11, "ahi_vasistas_count", i24, "ahi_vasistas_duration");
            return a11;
        }
    }

    public static JsonObject a(String str) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("block_name", str);
        jsonObject.addProperty(ConstantsWs.JSON_SESSION_KEY_UTCTIME, b(DateTime.now()));
        return jsonObject;
    }

    public static String b(DateTime dateTime) {
        return ISODateTimeFormat.dateTimeNoMillis().print(dateTime);
    }

    public static JsonObject c(int i11, String str, boolean z5) {
        JsonObject a11 = a("update_firmware_download");
        a11.addProperty("firmware_url", str);
        a11.addProperty("download_success", Boolean.valueOf(z5));
        a11.addProperty("firmware_size", Integer.valueOf(i11));
        return a11;
    }

    public static JsonObject d(ConnectReason connectReason, int i11) {
        JsonObject a11 = a("update_firmware_end");
        a11.addProperty("connect_reason", connectReason.toString());
        a11.addProperty("firmware_version", Integer.valueOf(i11));
        return a11;
    }
}
