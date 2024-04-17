package com.withings.coach.chatbot;

import androidx.camera.core.y1;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import java.util.Arrays;
import java.util.List;
import nm0.k;
import org.jsoup.nodes.Document;
/* compiled from: UrlMetaDataParser.kt */
/* loaded from: classes3.dex */
public final class n1 {

    /* compiled from: UrlMetaDataParser.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f33035a;

        /* renamed from: b  reason: collision with root package name */
        private final String f33036b;

        /* renamed from: c  reason: collision with root package name */
        private final String f33037c;

        /* renamed from: d  reason: collision with root package name */
        private final String f33038d;

        public a(String str, String str2, String str3, String str4) {
            this.f33035a = str;
            this.f33036b = str2;
            this.f33037c = str3;
            this.f33038d = str4;
        }

        public final String a() {
            return this.f33036b;
        }

        public final String b() {
            return this.f33037c;
        }

        public final String c() {
            return this.f33035a;
        }

        public final String d() {
            return this.f33038d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f33035a, aVar.f33035a) && kotlin.jvm.internal.u.e(this.f33036b, aVar.f33036b) && kotlin.jvm.internal.u.e(this.f33037c, aVar.f33037c) && kotlin.jvm.internal.u.e(this.f33038d, aVar.f33038d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int i11 = 0;
            String str = this.f33035a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.f33036b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.f33037c;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str4 = this.f33038d;
            if (str4 != null) {
                i11 = str4.hashCode();
            }
            return i14 + i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UrlPreview(title=");
            sb2.append(this.f33035a);
            sb2.append(", imageUrl=");
            sb2.append(this.f33036b);
            sb2.append(", name=");
            sb2.append(this.f33037c);
            sb2.append(", url=");
            return y1.e(sb2, this.f33038d, ")");
        }
    }

    public static a a(String str) {
        Object a11;
        try {
            Document b10 = org.jsoup.parser.f.b(str);
            kotlin.jvm.internal.u.g(b10);
            a11 = c(b10);
            if (a11 == null) {
                a11 = b(b10);
            }
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (a11 instanceof k.a) {
            a11 = null;
        }
        return (a) a11;
    }

    private static a b(Document document) {
        String str;
        String str2;
        String str3;
        String str4;
        List<org.jsoup.nodes.e> O = document.a0("script[type=application/ld+json]").c().O();
        kotlin.jvm.internal.u.i(O, "dataNodes(...)");
        JsonObject asJsonObject = JsonParser.parseString("[" + ((org.jsoup.nodes.e) kotlin.collections.x.I(O)).G() + "]").getAsJsonArray().get(0).getAsJsonObject();
        JsonElement jsonElement = asJsonObject.get("headline");
        if (jsonElement != null) {
            str = jsonElement.getAsString();
        } else {
            str = null;
        }
        JsonElement jsonElement2 = asJsonObject.get("publisher").getAsJsonObject().get("name");
        if (jsonElement2 != null) {
            str2 = jsonElement2.getAsString();
        } else {
            str2 = null;
        }
        JsonElement jsonElement3 = asJsonObject.get(HealthUserProfile.USER_PROFILE_KEY_IMAGE).getAsJsonObject().get("url");
        if (jsonElement3 != null) {
            str3 = jsonElement3.getAsString();
        } else {
            str3 = null;
        }
        JsonElement jsonElement4 = asJsonObject.get("mainEntityOfPage");
        if (jsonElement4 != null) {
            str4 = jsonElement4.getAsString();
        } else {
            str4 = null;
        }
        a aVar = new a(str, str3, str2, str4);
        if (str == null && str3 == null && str2 == null && str4 == null) {
            return null;
        }
        return aVar;
    }

    private static a c(Document document) {
        String str;
        String str2;
        String str3;
        String str4;
        org.jsoup.nodes.g c11 = document.a0(String.format("meta[property=og:%s]", Arrays.copyOf(new Object[]{"title"}, 1))).c();
        if (c11 != null) {
            str = c11.c("content");
        } else {
            str = null;
        }
        org.jsoup.nodes.g c12 = document.a0(String.format("meta[property=og:%s]", Arrays.copyOf(new Object[]{HealthUserProfile.USER_PROFILE_KEY_IMAGE}, 1))).c();
        if (c12 != null) {
            str2 = c12.c("content");
        } else {
            str2 = null;
        }
        org.jsoup.nodes.g c13 = document.a0(String.format("meta[property=og:%s]", Arrays.copyOf(new Object[]{"site_name"}, 1))).c();
        if (c13 != null) {
            str3 = c13.c("content");
        } else {
            str3 = null;
        }
        org.jsoup.nodes.g c14 = document.a0(String.format("meta[property=og:%s]", Arrays.copyOf(new Object[]{"url"}, 1))).c();
        if (c14 != null) {
            str4 = c14.c("content");
        } else {
            str4 = null;
        }
        a aVar = new a(str, str2, str3, str4);
        if (str == null && str2 == null && str3 == null && str4 == null) {
            return null;
        }
        return aVar;
    }
}
