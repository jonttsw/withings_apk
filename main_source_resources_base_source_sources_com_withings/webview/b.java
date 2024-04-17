package com.withings.webview;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import nm0.j;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Session;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import p80.a;
import p80.b;
/* compiled from: PrivateWebviewManager.kt */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f46889a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, a> f46890b = new HashMap<>();

    /* compiled from: PrivateWebviewManager.kt */
    /* loaded from: classes4.dex */
    public interface a {
        j a(String str, Map map);

        String getServiceName();
    }

    private b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r4 == r8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(com.withings.webview.b r4, java.lang.String r5, java.lang.String r6, java.util.Map r7, qm0.d r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof com.withings.webview.c
            if (r0 == 0) goto L16
            r0 = r8
            com.withings.webview.c r0 = (com.withings.webview.c) r0
            int r1 = r0.f46894d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f46894d = r1
            goto L1b
        L16:
            com.withings.webview.c r0 = new com.withings.webview.c
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r4 = r0.f46892b
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r0.f46894d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.String r5 = r0.f46891a
            nm0.l.b(r4)
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            nm0.l.b(r4)
            if (r5 == 0) goto L63
            if (r6 != 0) goto L3c
            goto L63
        L3c:
            java.util.HashMap<java.lang.String, com.withings.webview.b$a> r4 = com.withings.webview.b.f46890b
            java.lang.Object r4 = r4.get(r5)
            com.withings.webview.b$a r4 = (com.withings.webview.b.a) r4
            if (r4 == 0) goto L57
            r0.f46891a = r5
            r0.f46894d = r2
            nm0.j r4 = r4.a(r6, r7)
            if (r4 != r8) goto L51
            goto L56
        L51:
            r8 = r4
            nm0.j r8 = (nm0.j) r8
            if (r8 == 0) goto L57
        L56:
            return r8
        L57:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Service handler is null for service "
            java.lang.String r5 = androidx.activity.a0.b(r6, r5)
            r4.<init>(r5)
            throw r4
        L63:
            if (r5 == 0) goto L77
            if (r6 != 0) goto L6f
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Error : action is null"
            r4.<init>(r5)
            goto L7e
        L6f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Unknown error, check with the Android team !"
            r4.<init>(r5)
            goto L7e
        L77:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Error : service is null"
            r4.<init>(r5)
        L7e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.webview.b.a(com.withings.webview.b, java.lang.String, java.lang.String, java.util.Map, qm0.d):java.io.Serializable");
    }

    public static final JsonObject b(b bVar, String str, String str2, String str3, int i11, JsonElement jsonElement) {
        bVar.getClass();
        JsonObject jsonObject = new JsonObject();
        if (str == null) {
            str = "no ID";
        }
        jsonObject.addProperty("id", str);
        if (str2 == null) {
            str2 = "no service";
        }
        jsonObject.addProperty("service", str2);
        if (str3 == null) {
            str3 = "no action";
        }
        jsonObject.addProperty(AMPExtension.Action.ATTRIBUTE_NAME, str3);
        jsonObject.addProperty("status", Integer.valueOf(i11));
        jsonObject.add(Message.BODY, jsonElement);
        return jsonObject;
    }

    public static void c(a aVar) {
        f46890b.put(aVar.getServiceName(), aVar);
    }

    public static void d(a.InterfaceC1507a interfaceC1507a) {
        p80.a aVar;
        a aVar2 = f46890b.get("control");
        if (aVar2 instanceof p80.a) {
            aVar = (p80.a) aVar2;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.b(interfaceC1507a);
        }
    }

    public static void e(b.a aVar) {
        p80.b bVar;
        a aVar2 = f46890b.get(Session.ELEMENT);
        if (aVar2 instanceof p80.b) {
            bVar = (p80.b) aVar2;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.b(aVar);
        }
    }
}
