package com.withings.comm.trace;

import android.content.Context;
import androidx.camera.camera2.internal.h2;
import androidx.camera.core.y1;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.withings.comm.trace.b;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i0;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: TraceFileHelper.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f33196a;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((File) t11).getName(), ((File) t12).getName());
        }
    }

    @Inject
    public c(Context context) {
        File dataDir = context.getDataDir();
        String str = File.separator;
        this.f33196a = dataDir + str + "trace" + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Comparator] */
    private final File c(String str, int i11, b bVar) {
        String str2;
        int i12;
        String str3 = File.separator;
        StringBuilder sb2 = new StringBuilder();
        String str4 = this.f33196a;
        sb2.append(str4);
        sb2.append(str);
        sb2.append(str3);
        sb2.append(i11);
        File file = new File(sb2.toString());
        boolean z5 = bVar instanceof b.a;
        if (z5) {
            str2 = ConstantsWs.MAINT_FORMAT_BIN;
        } else if (bVar instanceof b.C0448b) {
            str2 = LearnMoreManager.KEY_LEARN_MORE_JSON;
        } else if (bVar instanceof b.c) {
            str2 = "txt";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        File[] listFiles = file.listFiles();
        File file2 = null;
        if (listFiles != null) {
            Iterator it = l.R(listFiles, new Object()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                long length = ((File) next).length();
                if (z5) {
                    i12 = 450000;
                } else if ((bVar instanceof b.C0448b) || (bVar instanceof b.c)) {
                    i12 = 400000;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (length < i12) {
                    file2 = next;
                    break;
                }
            }
            file2 = file2;
        }
        if (file2 == null) {
            String str5 = File.separator;
            long currentTimeMillis = System.currentTimeMillis();
            File file3 = new File(str4 + str + str5 + i11 + str5 + currentTimeMillis + "." + str2);
            file3.createNewFile();
            return file3;
        }
        return file2;
    }

    public final void a(String str) {
        File file = new File(y1.e(new StringBuilder(), this.f33196a, str));
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public final void b(int i11, String str) {
        String str2 = File.separator;
        File file = new File(this.f33196a + str + str2 + i11);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public final List<File> d() {
        File[] listFiles = new File(this.f33196a).listFiles();
        if (listFiles != null) {
            return l.a0(listFiles);
        }
        return i0.f76187a;
    }

    public final File e(String macAddress) {
        u.j(macAddress, "macAddress");
        return new File(h2.c(new StringBuilder(), this.f33196a, macAddress, File.separator));
    }

    public final void f(String str, int i11, b traceContent) {
        JsonObject jsonObject;
        u.j(traceContent, "traceContent");
        if (traceContent instanceof b.a) {
            b.a aVar = (b.a) traceContent;
            wm0.b.a(c(str, i11, aVar), aVar.a());
        } else if (traceContent instanceof b.C0448b) {
            b.C0448b c0448b = (b.C0448b) traceContent;
            File c11 = c(str, i11, c0448b);
            if (c11.length() != 0) {
                JsonReader jsonReader = new JsonReader(new FileReader(c11));
                try {
                    jsonObject = JsonParser.parseReader(jsonReader).getAsJsonObject();
                    jsonObject.getAsJsonArray("data").add(JsonParser.parseString(c0448b.a()));
                    ge0.d.a(jsonReader, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ge0.d.a(jsonReader, th2);
                        throw th3;
                    }
                }
            } else {
                jsonObject = new JsonObject();
                JsonArray jsonArray = new JsonArray();
                jsonArray.add(JsonParser.parseString(c0448b.a()));
                y yVar = y.f85009a;
                jsonObject.add("data", jsonArray);
            }
            String jsonElement = jsonObject.toString();
            u.i(jsonElement, "toString(...)");
            wm0.b.g(c11, jsonElement);
        } else if (traceContent instanceof b.c) {
            b.c cVar = (b.c) traceContent;
            File c12 = c(str, i11, cVar);
            String text = cVar.a();
            Charset charset = dp0.c.f64094b;
            u.j(text, "text");
            u.j(charset, "charset");
            byte[] bytes = text.getBytes(charset);
            u.i(bytes, "getBytes(...)");
            wm0.b.a(c12, bytes);
        }
    }
}
