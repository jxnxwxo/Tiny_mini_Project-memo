제일먼저 Controller(Class)
컨트롤러는 무조건 서비스한테만 연락
@Controller, @requestmapping @responsebody
Public Service 

그다음 Service -> 그다음에 Autowired Controller에있는거



-> DAO - > VO







1. index.html 에 맘에드는 Source 가져오기

2. 회원가입 form 만들기

   `<label>`로 input 설명, 각 항목에 `id` 부여해주고, `placeholder`로 칸 설명
   이용약관 `type=checkbox`, `autocomplete="off" checked`

3. my.js 만들기
   `$(document).ready(function(){}





아이디 중복체크

중복체크 안눌렀을때 -> 누른거 확인해야함 -> 전역변수로 count=0놓고 -> count가 1로 올라가지않으면 회원가입 controller로 못가게

중복체크 하고 아이디 수정할때 -> 처음에 중복체크 할때 아이디값을 서버에 저장 -> ajax로 넘겨줄때 그 값을 비교
