package main.huskyhelper;

import static android.content.Intent.ACTION_VIEW;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class FinancesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View financeView = inflater.inflate(R.layout.fragment_finances, container, false);

        financeView.findViewById(R.id.cashierOfficeBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/fa/finance/cashier";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        financeView.findViewById(R.id.tuitionBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/registrar/tuition-rates";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        financeView.findViewById(R.id.financialAidBtn).setOnClickListener(v -> {
            String url = "https://www.tacoma.uw.edu/finaid";
            Intent intent = new Intent(ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        return financeView;
    }
}