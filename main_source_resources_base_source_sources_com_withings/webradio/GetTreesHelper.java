package com.withings.webradio;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webradio.model.WebRadioNode;
import com.withings.webradio.network.GetWebRadioTree;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: GetTreesHelper.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\"B\u0019\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/withings/webradio/GetTreesHelper;", "", "Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;", "treeType", "Lcom/withings/webradio/model/WebRadioNode;", "getNode", "(Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;)Lcom/withings/webradio/model/WebRadioNode;", "Lnm0/y;", "onTreeReceived", "()V", "getGenresNode", "()Lcom/withings/webradio/model/WebRadioNode;", "getPlacesNode", "getLanguageNode", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "getTrees", "(Landroid/content/Context;)V", "Lcom/withings/webradio/GetTreesHelper$Callback;", "callback", "Lcom/withings/webradio/GetTreesHelper$Callback;", "getCallback", "()Lcom/withings/webradio/GetTreesHelper$Callback;", "setCallback", "(Lcom/withings/webradio/GetTreesHelper$Callback;)V", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "remoteRepository", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "", "Lcom/withings/webradio/GetTreeHolder;", "getTreeHolders", "Ljava/util/List;", "<init>", "(Lcom/withings/webradio/GetTreesHelper$Callback;Lcom/withings/webradio/network/WebRadiosRemoteRepository;)V", "Callback", "webradio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetTreesHelper {
    private Callback callback;
    private final List<GetTreeHolder> getTreeHolders;
    private final WebRadiosRemoteRepository remoteRepository;

    /* compiled from: GetTreesHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/withings/webradio/GetTreesHelper$Callback;", "", "Lcom/withings/webradio/GetTreesHelper;", "helper", "Lnm0/y;", "onTreesLoaded", "(Lcom/withings/webradio/GetTreesHelper;)V", "onFailedToGetTrees", "webradio_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface Callback {
        void onFailedToGetTrees(GetTreesHelper getTreesHelper);

        void onTreesLoaded(GetTreesHelper getTreesHelper);
    }

    public GetTreesHelper(Callback callback, WebRadiosRemoteRepository remoteRepository) {
        u.j(remoteRepository, "remoteRepository");
        this.callback = callback;
        this.remoteRepository = remoteRepository;
        this.getTreeHolders = new ArrayList();
    }

    private final WebRadioNode getNode(GetWebRadioTree.WebRadioTreeType webRadioTreeType) {
        Object obj;
        Iterator<T> it = this.getTreeHolders.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((GetTreeHolder) obj).getGetTree().getWebRadioTreeType() == webRadioTreeType) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        GetTreeHolder getTreeHolder = (GetTreeHolder) obj;
        if (getTreeHolder == null) {
            return null;
        }
        return getTreeHolder.getWebRadioNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTreeReceived() {
        List<GetTreeHolder> list = this.getTreeHolders;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (GetTreeHolder getTreeHolder : list) {
                if (getTreeHolder.getWebRadioNode() == null) {
                    return;
                }
            }
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onTreesLoaded(this);
        }
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final WebRadioNode getGenresNode() {
        return getNode(GetWebRadioTree.WebRadioTreeType.Genres);
    }

    public final WebRadioNode getLanguageNode() {
        return getNode(GetWebRadioTree.WebRadioTreeType.Language);
    }

    public final WebRadioNode getPlacesNode() {
        return getNode(GetWebRadioTree.WebRadioTreeType.Places);
    }

    public final void getTrees(Context context) {
        u.j(context, "context");
        BuildersKt.runBlocking(Dispatchers.getIO(), new GetTreesHelper$getTrees$1(this, context, null));
    }

    public final void setCallback(Callback callback) {
        this.callback = callback;
    }
}
