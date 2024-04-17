package com.withings.zendesk.repositories.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.n0;
import androidx.work.w;
import com.google.gson.Gson;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.zendesk.models.ZendeskDevice;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.models.ZendeskStatic;
import com.withings.zendesk.repositories.network.ZendeskManagerSync;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ZendeskManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/zendesk/repositories/data/ZendeskManager;", "Landroid/os/Parcelable;", "Lcom/withings/zendesk/models/ZendeskStatic;", "isStaticValidOrNull", "()Lcom/withings/zendesk/models/ZendeskStatic;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "get", "(Landroid/content/Context;)Lcom/withings/zendesk/models/ZendeskStatic;", "fromWs", "Lnm0/y;", "save", "(Landroid/content/Context;Lcom/withings/zendesk/models/ZendeskStatic;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "PREFS_NAME", "Ljava/lang/String;", "KEY_JSON", "static", "Lcom/withings/zendesk/models/ZendeskStatic;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ZendeskManager implements Parcelable {
    private static final String KEY_JSON = "json";
    private static final String PREFS_NAME = "Zendesk";

    /* renamed from: static  reason: not valid java name */
    private static ZendeskStatic f5static;
    public static final ZendeskManager INSTANCE = new ZendeskManager();
    public static final int $stable = 8;
    public static final Parcelable.Creator<ZendeskManager> CREATOR = new Creator();

    /* compiled from: ZendeskManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<ZendeskManager> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskManager createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            parcel.readInt();
            return ZendeskManager.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskManager[] newArray(int i11) {
            return new ZendeskManager[i11];
        }
    }

    private ZendeskManager() {
    }

    private final ZendeskStatic isStaticValidOrNull() {
        List<ZendeskDevice> devices;
        List<ZendeskLabel> labels;
        ZendeskStatic zendeskStatic = f5static;
        if (zendeskStatic == null || (devices = zendeskStatic.getDevices()) == null || !(!devices.isEmpty()) || (labels = zendeskStatic.getLabels()) == null || !(!labels.isEmpty())) {
            return null;
        }
        return zendeskStatic;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ZendeskStatic get(Context context) {
        u.j(context, "context");
        n0.n(context).c(new w.a(ZendeskManagerSync.class).b());
        ZendeskStatic isStaticValidOrNull = isStaticValidOrNull();
        if (isStaticValidOrNull == null) {
            f5static = (ZendeskStatic) new Gson().fromJson(context.getSharedPreferences(PREFS_NAME, 0).getString("json", null), (Class<Object>) ZendeskStatic.class);
            return INSTANCE.isStaticValidOrNull();
        }
        return isStaticValidOrNull;
    }

    public final void save(Context context, ZendeskStatic fromWs) {
        u.j(context, "context");
        u.j(fromWs, "fromWs");
        f5static = fromWs;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        u.g(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("json", new Gson().toJson(f5static));
        edit.apply();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(1);
    }
}
