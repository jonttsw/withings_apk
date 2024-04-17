package com.withings.zendesk.repositories.network;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.huawei.hms.feature.dynamic.b;
import com.withings.zendesk.models.SectionResponse;
import com.withings.zendesk.models.SectionsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import nm0.l;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zendesk.core.Constants;
/* compiled from: ZendeskSectionsRetriever.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/withings/zendesk/repositories/network/ZendeskSectionsRetriever;", "", "()V", "getSections", "", "Lcom/withings/zendesk/models/SectionResponse;", "categoryId", "", "sectionId", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ZendeskSectionsRetriever {
    public static final int $stable = 0;

    public final List<SectionResponse> getSections(long j5, long j11) {
        String str;
        i0 i0Var = i0.f76187a;
        try {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("withings.zendesk.com").appendPath("api").appendPath(b.f28611t).appendPath("help_center").appendPath("categories").appendPath(String.valueOf(j5)).appendPath("sections").appendQueryParameter("per_page", "1000");
            u.i(appendQueryParameter, "appendQueryParameter(...)");
            Request.Builder addHeader = new Request.Builder().addHeader("Content-Type", Constants.APPLICATION_JSON);
            String uri = appendQueryParameter.build().toString();
            u.i(uri, "toString(...)");
            Response execute = FirebasePerfOkHttpClient.execute(new OkHttpClient().newCall(addHeader.url(uri).build()));
            if (execute.isSuccessful()) {
                ResponseBody body = execute.body();
                if (body != null) {
                    str = body.string();
                } else {
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : ((SectionsResponse) new Gson().fromJson(str, (Class<Object>) SectionsResponse.class)).getSections()) {
                    if (((SectionResponse) obj).getParentSectionID() == j11) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            return i0Var;
        } catch (Throwable th2) {
            l.a(th2);
            return i0Var;
        }
    }
}
