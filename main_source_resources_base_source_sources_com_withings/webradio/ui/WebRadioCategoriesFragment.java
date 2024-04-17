package com.withings.webradio.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.webradio.R;
import com.withings.webradio.model.WebRadioCategory;
import com.withings.webradio.ui.WebRadioCategoryViewHolder;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
public class WebRadioCategoriesFragment extends Fragment implements WebRadioCategoryViewHolder.Listener {
    private Callback callback;
    private RecyclerView categoriesList;

    /* loaded from: classes4.dex */
    public interface Callback {
        void onCategorySelected(WebRadioCategoriesFragment webRadioCategoriesFragment, WebRadioCategory webRadioCategory);
    }

    /* loaded from: classes4.dex */
    private class CategoryAdapter extends RecyclerView.Adapter<WebRadioCategoryViewHolder> {
        private final List<WebRadioCategory> categories;

        /* synthetic */ CategoryAdapter(WebRadioCategoriesFragment webRadioCategoriesFragment, int i11) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.categories.size();
        }

        private CategoryAdapter() {
            this.categories = Arrays.asList(WebRadioCategory.Trending, WebRadioCategory.LocalRadio, WebRadioCategory.Music, WebRadioCategory.Sports, WebRadioCategory.News, WebRadioCategory.Talk, WebRadioCategory.Country, WebRadioCategory.Language, WebRadioCategory.Ambient, WebRadioCategory.Mediative, WebRadioCategory.Classical, WebRadioCategory.Genres);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(WebRadioCategoryViewHolder webRadioCategoryViewHolder, int i11) {
            webRadioCategoryViewHolder.setCategory(this.categories.get(i11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public WebRadioCategoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
            WebRadioCategoryViewHolder webRadioCategoryViewHolder = new WebRadioCategoryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.line_webradio_category, viewGroup, false));
            webRadioCategoryViewHolder.setListener(WebRadioCategoriesFragment.this);
            return webRadioCategoryViewHolder;
        }
    }

    @Override // com.withings.webradio.ui.WebRadioCategoryViewHolder.Listener
    public void onCategoryClick(WebRadioCategoryViewHolder webRadioCategoryViewHolder, WebRadioCategory webRadioCategory) {
        this.callback.onCategorySelected(this, webRadioCategory);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_wsd_webradio, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.categoriesList.setAdapter(new CategoryAdapter(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.webradios);
        this.categoriesList = recyclerView;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }
}
