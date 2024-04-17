package com.withings.common.device.model.capabilities;

import androidx.camera.camera2.internal.e;
import kotlin.Metadata;
import sm0.b;
/* compiled from: DeviceWithVideoMedia.kt */
/* loaded from: classes3.dex */
public interface DeviceWithVideoMedia {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceWithVideoMedia.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/model/capabilities/DeviceWithVideoMedia$VideoType;", "", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class VideoType {

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ VideoType[] f35227a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f35228b = 0;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.common.device.model.capabilities.DeviceWithVideoMedia$VideoType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.common.device.model.capabilities.DeviceWithVideoMedia$VideoType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.common.device.model.capabilities.DeviceWithVideoMedia$VideoType, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.common.device.model.capabilities.DeviceWithVideoMedia$VideoType, java.lang.Enum] */
        static {
            VideoType[] videoTypeArr = {new Enum("HowToUse", 0), new Enum("VascularAge", 1), new Enum("SegmentalBodyComposition", 2), new Enum("ECG6Leads", 3)};
            f35227a = videoTypeArr;
            b.a(videoTypeArr);
        }

        private VideoType() {
            throw null;
        }

        public static VideoType valueOf(String str) {
            return (VideoType) Enum.valueOf(VideoType.class, str);
        }

        public static VideoType[] values() {
            return (VideoType[]) f35227a.clone();
        }
    }

    /* compiled from: DeviceWithVideoMedia.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f35229a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35230b;

        public a(int i11, int i12) {
            this.f35229a = i11;
            this.f35230b = i12;
        }

        public final int a() {
            return this.f35230b;
        }

        public final int b() {
            return this.f35229a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f35229a == aVar.f35229a && this.f35230b == aVar.f35230b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f35230b) + (Integer.hashCode(this.f35229a) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeviceMedia(deviceMediaUrl=");
            sb2.append(this.f35229a);
            sb2.append(", deviceMediaPlaceholderId=");
            return e.c(sb2, this.f35230b, ")");
        }
    }

    a l(String str);
}
