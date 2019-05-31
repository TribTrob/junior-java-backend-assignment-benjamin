package io.falcon.assignment.service;

import io.falcon.assignment.model.Payload;
import io.falcon.assignment.repository.PayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PayloadService {

    @Autowired
    private PayloadRepository payloadRepository;


    public void save(Payload payload){
       payloadRepository.save(payload);
    }

    public List<Payload> list(){
         List<Payload> payloads =payloadRepository.findAll();
         setLongestPalindrome(payloads);
         return payloads;
    }


    public void setLongestPalindrome(List<Payload>payloads){
        for (Payload payload : payloads){
            int maxLength = getPalindromeLength(payload);
            payload.setLongest_palindrome_size(maxLength);
        }
    }

    public int getPalindromeLength(Payload payload) {
        String content = payload.getContent();
        int n = content.length();

        boolean table[][] = new boolean[n][n];

        int maxLength = 1;
        for (int i =0; i <n; i++){
            table[i][i] = true;}

        for (int i=0; i <n-1; i++){
            if(content.charAt(i) == content.charAt(i+1)){
                table[i][i+1] = true;
                maxLength = 2;
                }
            }
        for (int k = 3; k <= n; ++k){
            for (int i = 0; i < n - k + 1; ++i){
                int j = i + k - 1;
                if (table[i + 1][j - 1] && content.charAt(i) ==
                        content.charAt(j)){
                    table[i][j] = true;
                    if (k > maxLength) {
                        maxLength = k;
                    }
                }
            }
        }
        return maxLength;
    }
}

