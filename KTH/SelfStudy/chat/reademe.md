## 실습 주제
여러 유저간에 채팅 할 수 있는 서버/클라이언트 실습입니다

### part 1
여러 클라이언트에서 서버에 데이터를 전송하는 실습을 진행합니다

인터넷에서 흔히 볼 수 있었던 샘플에서는 매 전송마다 소켓을 새로이 만들어 통신을 진행했지만,

본 실습에서는 클라이언트 당 한개의 소켓을 제공해 통신하도록 제장하였습니다

커밋 기록 : 6f505aa0cd137b61b93becc2333191caaf41c8de, 9d88fa88c9d5862d64df1df68b309c35a1464448


### part 2
서버에 전송된 데이터를 모아 클라이언트에게 전송해주는 실습을 진행합니다

이때 클라이언트는 자신이 요청하지 않아도 서버의 데이터가 갱신된다면 이를 전송받을 수 있어야 합니다

https://user-images.githubusercontent.com/46879264/187640410-491b8c04-2e1d-4818-b124-1e40d324a130.mov