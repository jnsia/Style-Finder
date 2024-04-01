import jwtAxiosInstance from '../../shared/utils/jwtAxiosInstance';

const url = '/api/closet';
const api = {
  uploadCloth: (clothPart: string, clothImage: File) => jwtAxiosInstance.post(`${url}/uploadCloset`, { clothPart, clothImage }),
  getClosets: (clothPart: string) => jwtAxiosInstance.post(`${url}/getAll`, clothPart),
  deleteCloth: (closetId: number) => jwtAxiosInstance.post(`${url}/delete/${closetId}`, closetId),
};

export default api;
