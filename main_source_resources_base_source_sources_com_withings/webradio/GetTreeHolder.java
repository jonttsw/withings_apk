package com.withings.webradio;

import com.withings.webradio.model.WebRadioNode;
import com.withings.webradio.network.GetWebRadioTree;
import com.withings.webradio.network.WebRadiosRemoteRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetTreesHelper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withings/webradio/GetTreeHolder;", "", "treeType", "Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;", "remoteRepository", "Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "(Lcom/withings/webradio/network/GetWebRadioTree$WebRadioTreeType;Lcom/withings/webradio/network/WebRadiosRemoteRepository;)V", "getTree", "Lcom/withings/webradio/network/GetWebRadioTree;", "getGetTree", "()Lcom/withings/webradio/network/GetWebRadioTree;", "setGetTree", "(Lcom/withings/webradio/network/GetWebRadioTree;)V", "webRadioNode", "Lcom/withings/webradio/model/WebRadioNode;", "getWebRadioNode", "()Lcom/withings/webradio/model/WebRadioNode;", "setWebRadioNode", "(Lcom/withings/webradio/model/WebRadioNode;)V", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetTreeHolder {
    private GetWebRadioTree getTree;
    private WebRadioNode webRadioNode;

    public GetTreeHolder(GetWebRadioTree.WebRadioTreeType treeType, WebRadiosRemoteRepository remoteRepository) {
        u.j(treeType, "treeType");
        u.j(remoteRepository, "remoteRepository");
        this.getTree = new GetWebRadioTree(treeType, remoteRepository);
    }

    public final GetWebRadioTree getGetTree() {
        return this.getTree;
    }

    public final WebRadioNode getWebRadioNode() {
        return this.webRadioNode;
    }

    public final void setGetTree(GetWebRadioTree getWebRadioTree) {
        u.j(getWebRadioTree, "<set-?>");
        this.getTree = getWebRadioTree;
    }

    public final void setWebRadioNode(WebRadioNode webRadioNode) {
        this.webRadioNode = webRadioNode;
    }
}
