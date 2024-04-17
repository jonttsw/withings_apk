package com.withings.comm.trace;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.withings.comm.trace.Traces;
import com.withings.comm.trace.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import m0.t;
import u70.i;
/* compiled from: TraceManager.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    private static e f33214b;

    /* renamed from: a  reason: collision with root package name */
    private final ij.e f33215a;

    public e(ij.e eVar) {
        this.f33215a = eVar;
    }

    public static e a() {
        e eVar = f33214b;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("You must call init before !");
    }

    public static Traces.ConnectReason b(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return Traces.ConnectReason.f33172d;
                }
                return Traces.ConnectReason.f33171c;
            }
            return Traces.ConnectReason.f33170b;
        }
        return Traces.ConnectReason.f33169a;
    }

    public static e c(ij.e eVar) {
        e eVar2 = new e(eVar);
        f33214b = eVar2;
        return eVar2;
    }

    public final void d(cj.b bVar, JsonObject jsonObject) {
        e(bVar.i().mac, jsonObject, 2);
    }

    public final void e(String str, JsonObject jsonObject, int i11) {
        i c11 = i.c(str);
        b.C0448b c0448b = new b.C0448b(jsonObject.toString());
        ij.e eVar = this.f33215a;
        u.j(eVar, "<this>");
        BuildersKt__BuildersKt.runBlocking$default(null, new d(eVar, c11, i11, c0448b, null), 1, null);
    }

    public final void f(i macAddress, int i11, b bVar) {
        ij.e eVar = this.f33215a;
        u.j(eVar, "<this>");
        u.j(macAddress, "macAddress");
        BuildersKt__BuildersKt.runBlocking$default(null, new d(eVar, macAddress, i11, bVar, null), 1, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u70.j, java.lang.Object] */
    public final void g(String str, int i11, ArrayList arrayList) {
        ArrayList y11 = t.y(arrayList, new Object());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = y11.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            byte[] bytes = str2.getBytes(dp0.c.f64094b);
            u.i(bytes, "getBytes(...)");
            int length = bytes.length;
            if (i12 + length > 300000 && (!arrayList3.isEmpty())) {
                arrayList2.add(arrayList3);
                arrayList3 = new ArrayList();
                i12 = 0;
            }
            arrayList3.add(str2);
            i12 += length;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(arrayList3);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            JsonObject a11 = Traces.a("messages");
            JsonArray jsonArray = new JsonArray();
            for (String str3 : (List) it2.next()) {
                jsonArray.add(new JsonPrimitive(str3));
            }
            a11.add("messages", jsonArray);
            e(str, a11, i11);
        }
    }
}
